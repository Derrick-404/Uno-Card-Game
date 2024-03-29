        +-------------+
        | GenerateHand|
        +-------------+
        |             |
        +-------------+
        | +populateDeck(ArrayList<Card>) |
        | +populateHand(ArrayList<Card>, ArrayList<Card>, Random) |
        +-------------+
          /_\
           |
           |
    +--------+
    |  Card  |
    +--------+
    |        |
    +--------+
    | +Card(Rank, Suit) |
    | +getRank(): Rank |
    | +getSuit(): Suit |
    | +toString(): String |
    +--------+
          /_\
           |
           |
    +-------+
    |  Rank |
    +-------+
    |       |
    +-------+
    | ZERO |
    | ONE |
    | TWO |
    | THREE |
    | FOUR |
    | FIVE |
    | SIX |
    | SEVEN |
    | EIGHT |
    | NINE |
    | DRAW_TWO |
    | DRAW_FOUR |           
    | REVERSE |
    | SKIP |
    | WILD_CARD |
    +-------+
          /_\
           |
           |
    +-------+
    |  Suit |
    +-------+
    |       |
    +-------+
    | RED |
    | YELLOW |
    | GREEN |
    | BLUE |
    +-------+
