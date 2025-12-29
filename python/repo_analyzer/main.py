from clone_repo import clone_repo
from file_scanner import scan_files
from feature_parser import parse_features
from step_parser import parse_steps
from mapper import map_steps_to_features
from impact_analysis import detect_changes
from exporter import export_json

import os

REPO_URL = "https://github.com/your/repo.git"
CLONE_DIR = "repo_clone"

if __name__ == "__main__":
    # 1. Clone repo
    clone_repo(REPO_URL, CLONE_DIR)

    # 2. Scan all files
    files = scan_files(CLONE_DIR)
    export_json(files, "files.json")

    # 3. Parse feature files
    features = parse_features(CLONE_DIR)
    export_json(features, "features.json")

    # 4. Parse step definitions
    steps = parse_steps(CLONE_DIR)
    export_json(steps, "steps.json")

    # 5. Map features → steps
    mappings, missing = map_steps_to_features(features, steps)
    export_json(mappings, "feature_step_mappings.json")
    export_json(missing, "missing_steps.json")

    print("Analysis complete.")
