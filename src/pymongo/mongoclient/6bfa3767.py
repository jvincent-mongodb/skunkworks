from pymongo import MongoClient
from typing import Any, Dict

client: MongoClient[Dict[str, Any]] = MongoClient()