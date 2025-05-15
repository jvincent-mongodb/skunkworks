from pymongo import AsyncMongoClient
from typing import Any, Dict

client: AsyncMongoClient[Dict[str, Any]] = AsyncMongoClient()