def map_steps_to_features(features, steps):
    all_step_phrases = set()
    for step_file in steps.values():
        all_step_phrases.update(step_file["steps"])

    mappings = {}
    missing = []

    for feature_path, detail in features.items():
        used = []
        for scenario in detail["scenarios"]:
            phrase = scenario.replace("Scenario:", "").strip()
            matched = False

            for step_text in all_step_phrases:
                if phrase.lower() in step_text.lower():
                    used.append(step_text)
                    matched = True
                    break

            if not matched:
                missing.append({
                    "feature": feature_path,
                    "scenario": scenario,
                    "reason": "No matching step definition found"
                })

        mappings[feature_path] = used

    return mappings, missing
