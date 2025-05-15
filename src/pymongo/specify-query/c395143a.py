from pymongo import MongoClient
from bson.objectid import ObjectId

from flask import Flask, render_template

client = MongoClient()
app = Flask(__name__)

@app.route("/posts/<_id>")
def show_post(_id):
   # NOTE!: converting _id from string to ObjectId before passing to find_one
   post = client.db.posts.find_one({'_id': ObjectId(_id)})
   return render_template('post.html', post=post)

if __name__ == "__main__":
    app.run()