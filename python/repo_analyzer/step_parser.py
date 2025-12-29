import os
import re

STEP_KEYWORDS = ["Given", "When", "Then", "And", "But"]

def parse_steps(base_dir):
    steps = {}

    pattern = r"@(Given|When|Then|And|But)\(\"(.*?)\"\)"

    for root, _, files in os.walk(base_dir):
        for file in files:
            if file.endswith(".java") and "Steps" in file:
                fp = os.path.join(root, file)
                with open(fp, "r") as f:
                    data = f.read()

                matches = re.findall(pattern, data)
                step_texts = [m[1] for m in matches]

                steps[fp] = {
                    "file": fp,
                    "step_count": len(step_texts),
                    "steps": step_texts
                }

    return steps
