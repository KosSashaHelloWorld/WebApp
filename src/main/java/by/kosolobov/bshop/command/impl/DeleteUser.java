package by.kosolobov.bshop.command.impl;

import by.kosolobov.bshop.command.SimpleCommand;
import jakarta.servlet.http.HttpServletRequest;

public class DeleteUser implements SimpleCommand {
    @Override
    public String execute(HttpServletRequest req) {
        return null;
    }
}