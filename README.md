# Weather Application

This is a simple Android Application that uses API to inform about the weather of a location, when asked.
It uses the WeatherMap API for this purpose, where we are allowed to make 100k calls per day on a free basis. 

### Functioning
When a user enters a city name and presses the button, we make a POST request to the API with the query for the city that the user has entered. This data arrives to us in JSON format, and can't be displayed in raw format. Hence, we take the data and organise it into the format used for displaying the data, and then display the text to the user.
