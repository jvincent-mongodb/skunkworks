MongoCredential credential = MongoCredential.createOidcCredential(null)
   .withMechanismProperty("OIDC_CALLBACK", (context) ->  {
      String accessToken = ...
      return new OidcCallbackResult(accessToken);
   });