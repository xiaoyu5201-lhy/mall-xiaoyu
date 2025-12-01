# Stop and remove existing Nacos container
docker stop nacos
docker rm nacos

# Start Nacos with all required ports mapped
docker run -d `
  -p 8848:8848 `
  -p 8080:8080 `
  -p 9848:9848 `
  --name nacos `
  --env MODE=standalone `
  nacos/nacos-server:latest

Write-Host "Nacos container restarted with all ports mapped (8848, 8080, 9848)"
Write-Host "Wait 30 seconds for Nacos to fully start..."
Start-Sleep -Seconds 30
Write-Host "Nacos should be ready now!"
Write-Host "Console: http://127.0.0.1:8080/nacos"
