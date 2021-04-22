package ua.goit.bot.controller;

public enum BotKey {
    USER_NAME("Some_bot_key"),
    TOKEN("Some_bot_token");

    private final String value;

    BotKey(String value) {
        this.value = value;
    }

    public String get() {
        return value;
    }
}
