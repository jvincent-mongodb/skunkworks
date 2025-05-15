ClassModel<UserRecordPojo> userRecordPojo = ClassModel.builder(UserRecordPojo.class).enableDiscriminator(true).build();
ClassModel<User> userModel = ClassModel.builder(User.class).enableDiscriminator(true).build();
ClassModel<FreeUser> freeUserModel = ClassModel.builder(FreeUser.class).enableDiscriminator(true).build();
ClassModel<SubscriberUser> subscriberUserModel = ClassModel.builder(SubscriberUser.class).enableDiscriminator(true).build();

PojoCodecProvider pojoCodecProvider = PojoCodecProvider.builder().register(userRecordPojo, userModel, freeUserModel, subscriberUserModel).build();

CodecRegistry pojoCodecRegistry = fromRegistries(getDefaultCodecRegistry(), fromProviders(pojoCodecProvider));