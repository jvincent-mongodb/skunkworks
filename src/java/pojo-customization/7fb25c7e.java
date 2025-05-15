ClassModelBuilder<BirthdayInvitation> classModel = ClassModel.builder(BirthdayInvitation.class);
((PropertyModelBuilder<Integer>) classModel.getProperty("age"))
        .propertySerialization(new CourteousAgeSerialization());

PojoCodecProvider pojoCodecProvider = PojoCodecProvider.builder().register(classModel.build()).build();
CodecRegistry pojoCodecRegistry = fromRegistries(getDefaultCodecRegistry(), fromProviders(pojoCodecProvider));