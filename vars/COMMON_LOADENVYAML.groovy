def call(final String envName,final String configValue) {       
    def variableTextPath = libraryResource "variableDefinition/variable.yaml"
    def templateContent = readYaml text: variableTextPath
    def modifiedYaml = templateContent.replaceAll(/\$\{platformProjectName\}/, "sit")
    writeYaml file: variableTextPath, data: modifiedYaml
    return templateContent[envName][configValue]
}