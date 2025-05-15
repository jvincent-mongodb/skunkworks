var member = current().getField("member");

asList(project(fields(
    computed("membershipLevel",
        member.switchOn(field -> field
            .isString(s -> s)
            .isBoolean(b -> b.cond(of("Gold"), of("Guest")))
            .<MqlString>isArray(a -> a.last())
            .defaults(d -> of("Guest"))))
)));