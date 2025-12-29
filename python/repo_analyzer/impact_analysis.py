import os

def detect_changes(metadata_old, metadata_new):
    old_hash_map = {f["path"]: f["hash"] for f in metadata_old}
    new_hash_map = {f["path"]: f["hash"] for f in metadata_new}

    changed = []
    added = []
    removed = []

    for path, h in new_hash_map.items():
        if path not in old_hash_map:
            added.append(path)
        elif old_hash_map[path] != h:
            changed.append(path)

    for path in old_hash_map:
        if path not in new_hash_map:
            removed.append(path)

    return {
        "changed": changed,
        "added": added,
        "removed": removed
    }
