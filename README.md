Design an indoor sports arena online booking application using Spring boot and MYSQL.
Constraints:
Every sport/game can have one or more courts/boards (Ex: Badminton can have 4 courts in our sports arena)

Customers can book a sport/game with timeslots in multiples of 30 minutes. (i.e 30m, 1h, 1.5h etc). The slots can begin in multiples of 15 minutes (10.15 to 10.45, 15:30 to 17:00). only one court/board can be booked.

The timing of the arena will be different for weekdays and weekends. But no weekly holiday.

Every sport/game will have a fixed price per 30 minute slot. (Ex: Badminton can cost 100 rs for 30 minutes, Billiards can cost 200 rs for 30 minutes etc)

There can be holidays during which booking should not be allowed. A separate service tells whether a given day is a holiday or not for the arena.

The number of players is not a factor. (6 people can book a badminton court but only 4 can play at a time)

The customers have to be registered on our application for them to be able to book. Users use a username and password to register
