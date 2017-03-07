# A simple TodoMVC Implementation by [ActFramework](http://actframework.org) and [Riotjs](http://riotjs.com/)

## Setup

You must install [MongoDB](http://mongodb.com), [JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) and [Maven](http://maven.apache.org) to run this app

## Run

To run the app, type `mvn clean compile exec:exec`

## Understanding the app

This application has separated backend and UI implementation.

### Backend

The backend service is created using [ActFramework](http://actframework.org). It provides the following RESTful endpoints:

1. GET /todo - returns all TODO items
2. POST /todo with JSON body - Create an new TODO item
3. GET /todo/{id} - get a TODO item specified by `id`
4. PATCH /todo with JSON body - Update a TODO item specified by `id` with specified JSON body
5. DELETE /todo/{id} - remove TODO item specified by `id`

### UI

The UI app is created using [RiotJS](http://riotjs.com).

TBD ...