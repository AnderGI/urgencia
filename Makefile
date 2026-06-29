# 👇 This is a rule 👇
# target: dependency-1 dependency-2
# (tab) 	shell lines or recipes
# 👆 This is a rule 👆

see: ## Prints this help.
	while IFS= read -r line; do \
        if printf '%s\n' "$$line" | grep -Eq '^[a-z_/]+: *## .+'; then \
            printf '%s\n' "$$line"; \
        fi ;\
   done < Makefile

# This special target silences all shell lines
.SILENT:

test:
	echo "testing the makefile"

gradlew/help: ## Prints this help.
	./gradlew --help

gradlew/clean: ## delete content of the build directory
	./gradlew clean

gradlew/build: ## build a gradle project
	./gradlew build