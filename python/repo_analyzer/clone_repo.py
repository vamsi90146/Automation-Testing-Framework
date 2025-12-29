import git
import os
import shutil

def clone_repo(repo_url: str, clone_dir: str):
    if os.path.exists(clone_dir):
        shutil.rmtree(clone_dir)

    print(f"Cloning repo: {repo_url}")
    git.Repo.clone_from(repo_url, clone_dir)
    print("Clone complete.")
    return clone_dir
