import json
import csv

def export_json(data, path):
    with open(path, "w") as f:
        json.dump(data, f, indent=4)

def export_csv(data, path):
    keys = data[0].keys()
    with open(path, "w", newline="") as f:
        writer = csv.DictWriter(f, keys)
        writer.writeheader()
        writer.writerows(data)
