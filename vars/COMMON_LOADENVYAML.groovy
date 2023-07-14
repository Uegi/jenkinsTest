def call(final String envName,final String configValue) {       
    def variableTextPath = libraryResource "variableDefinition/variable.yaml"
    def templateContent = readYaml text: variableTextPath
    //def modifiedYaml = templateContent.replace('${platformProjectName}', "sit")
    //writeYaml file: variableTextPath, data: modifiedYaml
    //def finishContent = readYaml text: variableTextPath
    //return templateContent[envName][configValue]
    return platformProjectName
}