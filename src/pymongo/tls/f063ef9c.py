$ pypy -m pip install certifi
$ export SSL_CERT_FILE=$(pypy -c "import certifi; print(certifi.where())")