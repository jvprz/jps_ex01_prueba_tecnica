DROP TABLE IF EXISTS app_lfg;

CREATE TABLE users (
	id INT AUTO_INCREMENT PRIMARY KEY,
	username VARCHAR(30) NOT NULL,
	password VARCHAR(250) NOT NULL,
	mail VARCHAR(250) NOT NULL,
	name VARCHAR(30) NOT NULL,
	last_name VARCHAR(250) NOT NULL,
	steam VARCHAR(30),
	creation_date DATETIME DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO users (username, password, mail, name, last_name, steam) VALUES ('jvprz', 'Pa$$w0rd', 'jvprz@gmail.com', 'javier', 'perez', 'jvprz_steam');
INSERT INTO users (username, password, mail, name, last_name, steam) VALUES ('pdrpascl', 'Pa$$w0rd2', 'pdrpascl@gmail.com', 'pedro', 'pascal', 'pdrpascl_steam');
INSERT INTO users (username, password, mail, name, last_name, steam) VALUES ('hayley', 'Pa$$w0rd3', 'hayley@gmail.com', 'julia', 'garcia', 'hayley_steam');

CREATE TABLE videogames (
	id INT AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(100) NOT NULL,
	platform VARCHAR(250) NOT NULL,
	developer VARCHAR(100) NOT NULL,
	gender VARCHAR(250) NOT NULL
);

INSERT INTO videogames (title, platform, developer, gender) VALUES ('League of legends', 'PC', 'Riot Games', 'MOBA');
INSERT INTO videogames (title, platform, developer, gender) VALUES ('Valorant', 'PC', 'Riot Games', 'Tactical Shooter');
INSERT INTO videogames (title, platform, developer, gender) VALUES ('Minecraft', 'PC, PS, XBOX, Switch and more...', 'Mojang Studios', 'Sandbox');

CREATE TABLE parties (
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	creator INT NOT NULL,
	description VARCHAR(250),
	creation_date DATETIME DEFAULT CURRENT_TIMESTAMP,
	game INT NOT NULL,
	FOREIGN KEY (creator) REFERENCES users(id),
	FOREIGN KEY (game) REFERENCES videogames(id)
);

CREATE TABLE members (
	member INT NOT NULL,
	party INT NOT NULL,
	union_date DATETIME DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (member, party),
	FOREIGN KEY (member) REFERENCES users(id),
	FOREIGN KEY (party) REFERENCES parties(id)
);

CREATE TABLE messages (
	id INT AUTO_INCREMENT PRIMARY KEY,
	content VARCHAR(250) NOT NULL,
	creation_date DATETIME DEFAULT CURRENT_TIMESTAMP,
	author INT NOT NULL,
	party INT NOT NULL,
	FOREIGN KEY (author) REFERENCES users(id),
	FOREIGN KEY (party) REFERENCES parties(id)
);