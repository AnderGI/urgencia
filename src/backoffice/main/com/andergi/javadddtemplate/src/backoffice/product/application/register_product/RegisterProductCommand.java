package com.andergi.javadddtemplate.src.backoffice.product.application.register_product;

import com.andergi.javadddtemplate.src.shared.domain.command.Command;

public final class RegisterProductCommand extends Command {

    private final String id;
    private final String description;

    public RegisterProductCommand (final String id, final String description) {
        this.id = id;
        this.description = description;
    }

    public String id() {
        return this.id;
    }

    public String description() {
        return this.description;
    }

}
