# intellij-mdm

The experimental project to allow IntelliJ to check and
download the necessary dependencies and automatically
install them. 

The plugin, once installed (or better bundled) checks
regularly the specific endpoint to download the instructions
signed JSON. 

The instructions JSON look the following way:
```json
{
  "install-plugins": [
    
  ],
}
```
