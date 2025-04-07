🚀 Kafka 學習專案
歡迎來到 Kafka 學習專案！
本專案旨在學習並實作 Apache Kafka 的核心概念

⚙️ 環境需求
☕ Java 8 或以上版本

🐘 Apache Kafka（建議本機安裝 or Docker 啟動）

🐳 Docker（可選，若想使用容器化執行）

🏁 快速開始
📥 clone專案：
git clone https://github.com/allenhuang-tw/kafka-demo.git
cd kafka-demo
🚀 啟動 Kafka（建議透過 Docker 或 Kafka 安裝包）

▶️ 運行 Spring Boot 專案：
./mvnw spring-boot:run         # Mac/Linux
mvnw.cmd spring-boot:run       # Windows

🧪 測試 Kafka：
程式中已包含簡易的 Producer/Consumer 範例，可透過 API 或測試類啟動並驗證訊息傳遞。

🐳 使用 Docker 部署
如果你想要用 Docker 來部署整個專案：

🔨 建立映像檔：
docker build -t kafka-demo .

📦 運行容器：
docker run -d -p 8080:8080 --name kafka-demo kafka-demo

🔗 參考資源
📘 Apache Kafka 官方網站

🧰 Spring Kafka 整合教學（中文）
