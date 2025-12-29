import os

def parse_features(base_dir):
    features = {}

    for root, _, files in os.walk(base_dir):
        for file in files:
            if file.endswith(".feature"):
                path = os.path.join(root, file)
                with open(path, "r") as f:
                    content = f.read()

                scenarios = []
                for line in content.splitlines():
                    if line.strip().startswith("Scenario"):
                        scenarios.append(line.strip())

                features[path] = {
                    "file": path,
                    "scenario_count": len(scenarios),
                    "scenarios": scenarios
                }

    return features
