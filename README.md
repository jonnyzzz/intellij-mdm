# intellij-mdm

The experimental project to allow IntelliJ to check and
download the necessary dependencies and automatically
install them. 

The plugin, once installed (or better bundled) checks
regularly the specific endpoint to download the instructions
signed JSON. 

The instructions JSON look the following way:
```json5
{
  "install_plugins": [
    {
      "download_url" : "https://jonnyzzz.com/broken-example.zip",
      "include_parameters" : true // marks is IDE information should be included to the download URL, default true
    }
  ]
}
```

