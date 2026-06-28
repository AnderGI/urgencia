# 👇 This is a rule 👇
# target: dependency-1 dependency-2
# (tab) 	shell lines or recipes
# 👆 This is a rule 👆

# Author of this target: "Jesús L" CodelyTV platform user. Thkss :)
help: ## Prints this help.
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-20s\033[0m %s\n", $$1, $$2}'

# This special target silences all shell lines
.SILENT:

test:
	echo "testing the makefile"

gradlew/help: ## help for ./gradlew sh command line
	./gradlew --help

gradlew/clean: ## delete content of the build directory
	./gradlew clean

gradlew/build: ## build a gradle project
	./gradlew build