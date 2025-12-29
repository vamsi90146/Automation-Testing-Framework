import os
import hashlib
from datetime import datetime

def hash_file(path):
    h = hashlib.sha256()
    with open(path, "rb") as f:
        h.update(f.read())
    return h.hexdigest()

def scan_files(base_dir):
    metadata = []
    for root, _, files in os.walk(base_dir):
        for file in files:
            fp = os.path.join(root, file)

            metadata.append({
                "path": fp,
                "size": os.path.getsize(fp),
                "last_modified": datetime.fromtimestamp(os.path.getmtime(fp)).isoformat(),
                "hash": hash_file(fp)
            })
    return metadata
