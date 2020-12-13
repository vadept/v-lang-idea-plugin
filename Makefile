current_dir = $(shell pwd)
local_gradle = $(current_dir)/gradlew

.PHONY:help
help: ## print this message
	@echo "$$(grep -hE '^\S+:.*##' $(MAKEFILE_LIST) | sort | sed -e 's/:.*##\s*/:/' -e 's/^\(.\+\):\(.*\)/\x1b[36m\1\x1b[m:\2/' | column -c2 -t -s :)"

build: ## build the plugin
	$(local_gradle) build

test-ide: ## run Intellij with plugin installed for tests
	$(local_gradle) runIdeForUiTests
