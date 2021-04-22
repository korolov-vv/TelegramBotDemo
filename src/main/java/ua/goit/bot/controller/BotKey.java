package ua.goit.bot.controller;

public enum BotKey {
    USER_NAME("GoIT_CurrencyBot"),
    TOKEN("1679176414:AAGo83LEtbElSccH_4Dac0-Y4l-IF_ze6P4");

    private final String value;

    BotKey(String value) {
        this.value = value;
    }

    public String get() {
        return value;
    }
}
