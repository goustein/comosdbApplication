# comosdbApplication

U can test api  using :

curl --location --request POST 'http://localhost:8080/app/site' \
--header 'Content-Type: application/json' \
--data-raw '{
	"siteNum" : "12347",
	"siteAddress" : "Kudithipalem"
	
}'


it just persist the site in the cosmos DB
