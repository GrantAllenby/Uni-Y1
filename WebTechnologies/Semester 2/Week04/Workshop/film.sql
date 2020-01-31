# ***************************************************************
# *** Create the table structure for the table 'film_category' ****
# ***************************************************************

DROP TABLE IF EXISTS `film_category`;
CREATE TABLE IF NOT EXISTS `film_category` (
  `categoryID` varchar(6) NOT NULL default '',
  `categoryName` varchar(20) NOT NULL DEFAULT ''
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;


# *************************************************************
# ***Insert record data for the table `film_category`************
# *************************************************************

INSERT INTO `film_category` (`categoryID`, `categoryName`) VALUES
('c1', 'documentary'),
('c2', 'drama'),
('c3', 'epic'),
('c4', 'comedy'),
('c5', 'classic'),
('c6', 'thriller'),
('c7', 'music'),
('c8', 'buddy'),
('c9', 'sci-fi'),
('c10', 'horror'),
('c11', 'series');


# *********************************************************
# *** Create the table structure for the table 'film' *****
# *********************************************************

DROP TABLE IF EXISTS `film`;
CREATE TABLE IF NOT EXISTS `film` (
  `filmID` mediumint(9) NOT NULL default '0',
  `title` varchar(255) default NULL,
  `categoryID` varchar(6) default NULL,
  `notes` text,
  PRIMARY KEY (`filmID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

# *****************************************************
# ***Insert record data for the table `film`**********
# *****************************************************

INSERT INTO `film` (`filmID`, `title`, `categoryID`, `notes`) VALUES
(138, 'working girl', 'c4', NULL),
(23, 'la testament d''orphee', 'c5', ''),
(5, 'my darling clementine', 'c3', 'Henry Fonda'),
(59, 'i vitteloni', 'c2', ''),
(68, 'handsworth songs', 'c2', ''),
(73, 'fitscarraldo', 'c2', ''),
(227, 'hunchback of notre dame,', 'c5', '1939 remake of the Lon Chaney silent movie.  Charles Laughton and Maureen O''Hara'),
(78, 'seventh seal, the', 'c2', ''),
(87, 'long goodbye, the', 'c2', ''),
(89, 'smithereens', 'c2', ''),
(90, 'invitation, the', 'c2', ''),
(92, 'whale nation', 'c1', ''),
(94, 'conversation, the', 'c6', ''),
(95, 'long good friday, the', 'c6', ''),
(96, 'danton', 'c2', ''),
(98, 'missing', 'c2', ''),
(102, 'les visiteurs du soir', 'c2', ''),
(103, 'quatre cent coups', 'c2', ''),
(104, 'les mistons', 'c2', ''),
(105, 'blood sweat & tears', 'c2', ''),
(107, 'rhinoceros', 'c2', ''),
(108, 'tirez sur le pianist', 'c4', ''),
(113, 'grapes of wrath', 'c5', ''),
(114, 'guys & dolls', 'c7', 'Luck be a Lady, Sid Down you''re rockin the boat, gamblers and gals, but the colour of the tie you are wearing I''ll wager you know not.'),
(116, 'last year at marienbad', 'c2', ''),
(124, 'hustler, the', 'c5', ''),
(128, 'last picture show, the', 'c2', ''),
(131, 'le jour se leve', 'c6', ''),
(140, 'rollerball', 'c9', ''),
(142, 'getaway, the', 'c2', ''),
(143, 'raging bull', 'c2', ''),
(150, 'brimstone & treacle', 'c10', ''),
(153, 'bolweiser', 'c2', ''),
(154, 'death in venice', 'c2', ''),
(157, 'top hat', 'c5', ''),
(158, 'carefree', 'c5', ''),
(167, 'serpico', 'c2', ''),
(170, 'stand up nigel barton', 'c2', ''),
(172, 'caravaggio', 'c2', ''),
(174, 'hitch-hiker''s guide', 'c4', ''),
(175, 'where the green ants drea', 'c2', ''),
(176, 'ghosts in the machine', 'c1', ''),
(178, 'la peau douce', 'c2', ''),
(179, 'singing detective part 2', 'c2', ''),
(181, 'singing detective part 4', 'c2', ''),
(182, 'drowning pool', 'c2', ''),
(184, 'wall, the', 'c2', ''),
(185, 'around the world in 80 days', 'c4', ''),
(186, 'don''t look back', 'c1', ''),
(191, 'lady vanishes, the', 'c2', ''),
(194, 'spellbound', 'c5', ''),
(195, 'hammet', 'c2', ''),
(196, 'cabinet of dr caligari', 'c2', ''),
(197, 'robin hood', 'c2', ''),
(199, 'gimme shelter', 'c7', ''),
(201, 'painting in light', 'c1', ''),
(203, 'play it again sam', 'c4', ''),
(204, 'it was twenty years ago today', 'c1', ''),
(206, 'treasure of the sierra madre', 'c5', ''),
(210, 'maltese falcon, the', 'c5', ''),
(215, 'notorious', 'c5', ''),
(217, 'swingtime', 'c5', ''),
(219, 'talking heads', 'c1', ''),
(224, 'wise blood', 'c2', ''),
(247, 'five easy pieces', 'c2', ''),
(248, 'play it again sam', 'c4', ''),
(249, 'rashomon', 'c2', ''),
(58, 'heaven''s gate', 'c3', 'A lyrical though sometimes savage story about the west.  With John Hurt and has one of the best waltz scenes this side of the Pecos.'),
(82, 'annie hall', 'c4', 'After breaking up with his girlfriend Annie Hall, neurotic comedian Alvy Singer goes on a stream of conciousness journey through his memories of their relationship, trying to find out what caused them to part ways. He often breaks the fourth wall, speaking to the camera, entering peoples'' stories, and even using animation.'),
(134, 'themroc', 'c4', 'An amusing, surreal, relentless satirical swipe at the banality of the rat race.'),
(7, 'catch 22', 'c4', 'Based on the book by Joseph Heller.  A sometimes surreal black comedy about war.  Milo Milobender (John Voight) who is trying to make a deal with anybody in order to make a buck. Yosarian who thinks everyone is trying to kill him.'),
(33, 'paris texas', 'c2', 'Beautiful landscapes and haunting music from Ry Cooder.  The story of a man who having wandered around America after splitting up with his wife, returns to meet his child, reared by his brother and rediscover his past.  With Harry Dean Stanton and Natasha Kinski.'),
(126, 'babylon', 'c2', 'Brinsley Ford.  The movie centers around Brindsley Forde''s character blue. He fronts a reggae sound system based in west London. The movie captures the trials and tribulations of young black youths in troubled London in the early eighties.'),
(85, 'she', 'c5', 'CLASSIC '),
(152, 'atfer hours', 'c4', 'Comedy of errors, person goes out at night and has a measure of bad luck.'),
(228, 'easter parade', 'c7', 'directed by Charles Walters, with Judy Garland and Fred Astaire.'),
(54, 'deerhunter, the', 'c2', 'Do I like this movie, I''m not sure I do.'),
(51, 'burden of dreams', 'c1', 'Documentary about the making of Fitzcarraldo by Hertzog.'),
(162, 'blood wedding', 'c5', 'Electric and moving dance-mime of a Garcia Lorca story.  Spanish music and dancing.  It''s a hairs on the back of the neck job.'),
(9, 'thirty nine steps', 'c5', 'Fabulous film with Robert Donat as the hero eluding and ultimately, and I hope I''m not giving the game away here, thwarting the german villains.'),
(156, 'african queen', 'c5', 'Humphrey Bogart, Katherine Hepburn, Robert Morley - James Agee was the writer of the screenplay based on a novel by C.S. Forester.  There is surely no one out there who doesn''t know the plot.'),
(137, 'big sleep, the', 'c5', 'Humphrey Bogart, Lauren Bacall '),
(222, 'casablanca', 'c5', 'I thought I told you never to play that song.'),
(155, 'bullitt', 'c2', 'Isn''t this the film with the great car chase with Ali MacGraw?'),
(223, 'chinatown', 'c4', 'Jack Nicholson and Faye Dunnaway.  Good film, he''s great as the Marlowe type figure.'),
(165, 'big heat, the', 'c5', 'Lee Marvin, Gloria Grahame, Glenn Ford, Jocelyn Brando.  Kev things this is one of the greatest movies ever.  Poor Gloria gets coffee in the face from Lee Marvin, she reciprocates later in the film much too his annoyance.'),

(117, 'diner', 'c2', 'Mickey Rourke, Ellen Barkin, college kids go get something to eat. Mickey Rourke plays one of the only non-fag hairdressers in Hollywood history.'),
(22, 'orphee', 'c5', 'Orphee is a poet who becomes obsessed with Death (the Princess). They fall in love. Orphee''s wife, Eurydice, is killed by the Princess'' henchmen and Orphee goes after her into the Underworld. Although they have become dangerously entangled, the Princess sends Orphee back out of the Underworld, to carry on his life with Eurydice.'),
(66, '1900 part 2', 'c3', 'part 1 and notes are on video 64'),
(53, 'rumble fish', 'c8', 'Shot in black and white, with the ''rumble fish'' as the only thing in colour, with Mickey Rourke as motorcycle boy, Dennis Hopper as his father.  Moody is what I think you''d call it.'),
(119, 'alice in wonderland', 'c2', 'The best version of Alice I''ve seen.  Very surreal, with Peter Cook, John Geilgud and many other famous faces.  The are some wonderful images in it... great photography.'),
(91, 'seven samurai', 'c5', 'The film which inspired the making of The Magnificent Seven.  Stars the genius Toshiro Mifune.'),
(31, 'vivement dimanche', 'c6', 'Truffault homage to film noir.  The hero gets framed for murder his only ally a secretary who doesn''t like him very much.');

