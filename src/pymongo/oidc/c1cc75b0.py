class MyCallback(OIDCCallback):
    def fetch(self, context: OIDCCallbackContext) -> OIDCCallbackResult:
        with open("/var/run/secrets/kubernetes.io/serviceaccount/token") as fid:
            token = fid.read()
        return OIDCCallbackResult(access_token=token)