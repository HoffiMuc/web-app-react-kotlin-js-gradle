package com.accorddesk.frontend.examplecomponent

//const FilmSelect = Select.ofType<Films.IFilm>();
//
//interface SelectExampleState {
//    film: Films.IFilm;
//}
//
//export class SelectExample extends React.PureComponent<{}, SelectExampleState> {
//    public state: SelectExampleState = {
//        film: Films.TOP_100_FILMS[0]
//    };
//
//    public render() {
//        const buttonText = this.state.film.title;
//        return (
//        <Example header="Select Sandbox">
//        <FilmSelect
//        items={Films.TOP_100_FILMS}
//        itemPredicate={Films.filterFilm}
//        itemRenderer={Films.renderFilm}
//        noResults={<MenuItem disabled={true} text="No results." />}
//        onItemSelect={this.handleValueChange}
//        >
//        <Button text={buttonText} rightIcon="caret-down" />
//        </FilmSelect>
//        </Example>
//        );
//    }
//
//    private handleValueChange = (film: Films.IFilm) => this.setState({ film });
//}

data class Film(val title: String, val year: Int, var rank: Int)

/** Top 100 films as rated by IMDb users. http://www.imdb.com/chart/top */
val TOP_100_FILMS = mutableListOf(
    Film("The Shawshank Redemption", year = 1994, 0 ),
    Film("The Godfather", year = 1972, 0),
    Film("The Godfather: Part II", year = 1974, 0),
    Film("The Dark Knight", year = 2008, 0),
    Film("12 Angry Men", year = 1957, 0),
    Film("Schindler's List", year = 1993, 0),
    Film("Pulp Fiction", year = 1994, 0),
    Film("The Lord of the Rings: The Return of the King", year = 2003, 0),
    Film("The Good, the Bad and the Ugly", year = 1966, 0),
    Film("Fight Club", year = 1999, 0),
    Film("The Lord of the Rings: The Fellowship of the Ring", year = 2001, 0),
    Film("Star Wars: Episode V - The Empire Strikes Back", year = 1980, 0),
    Film("Forrest Gump", year = 1994, 0),
    Film("Inception", year = 2010, 0),
    Film("The Lord of the Rings: The Two Towers", year = 2002, 0),
    Film("One Flew Over the Cuckoo's Nest", year = 1975, 0),
    Film("Goodfellas", year = 1990, 0),
    Film("The Matrix", year = 1999, 0),
    Film("Seven Samurai", year = 1954, 0),
    Film("Star Wars: Episode IV - A New Hope", year = 1977, 0),
    Film("City of God", year = 2002, 0),
    Film("Se7en", year = 1995, 0),
    Film("The Silence of the Lambs", year = 1991, 0),
    Film("It's a Wonderful Life", year = 1946, 0),
    Film("Life Is Beautiful", year = 1997, 0),
    Film("The Usual Suspects", year = 1995, 0),
    Film("Léon: The Professional", year = 1994, 0),
    Film("Spirited Away", year = 2001, 0),
    Film("Saving Private Ryan", year = 1998, 0),
    Film("Once Upon a Time in the West", year = 1968, 0),
    Film("American History X", year = 1998, 0),
    Film("Interstellar", year = 2014, 0),
    Film("Casablanca", year = 1942, 0),
    Film("City Lights", year = 1931, 0),
    Film("Psycho", year = 1960, 0),
    Film("The Green Mile", year = 1999, 0),
    Film("The Intouchables", year = 2011, 0),
    Film("Modern Times", year = 1936, 0),
    Film("Raiders of the Lost Ark", year = 1981, 0),
    Film("Rear Window", year = 1954, 0),
    Film("The Pianist", year = 2002, 0),
    Film("The Departed", year = 2006, 0),
    Film("Terminator 2: Judgment Day", year = 1991, 0),
    Film("Back to the Future", year = 1985, 0),
    Film("Whiplash", year = 2014, 0),
    Film("Gladiator", year = 2000, 0),
    Film("Memento", year = 2000, 0),
    Film("The Prestige", year = 2006, 0),
    Film("The Lion King", year = 1994, 0),
    Film("Apocalypse Now", year = 1979, 0),
    Film("Alien", year = 1979, 0),
    Film("Sunset Boulevard", year = 1950, 0),
    Film("Dr. Strangelove or: How I Learned to Stop Worrying and Love the Bomb", year = 1964, 0),
    Film("The Great Dictator", year = 1940, 0),
    Film("Cinema Paradiso", year = 1988, 0),
    Film("The Lives of Others", year = 2006, 0),
    Film("Grave of the Fireflies", year = 1988, 0),
    Film("Paths of Glory", year = 1957, 0),
    Film("Django Unchained", year = 2012, 0),
    Film("The Shining", year = 1980, 0),
    Film("WALL·E", year = 2008, 0),
    Film("American Beauty", year = 1999, 0),
    Film("The Dark Knight Rises", year = 2012, 0),
    Film("Princess Mononoke", year = 1997, 0),
    Film("Aliens", year = 1986, 0),
    Film("Oldboy", year = 2003, 0),
    Film("Once Upon a Time in America", year = 1984, 0),
    Film("Witness for the Prosecution", year = 1957, 0),
    Film("Das Boot", year = 1981, 0),
    Film("Citizen Kane", year = 1941, 0),
    Film("North by Northwest", year = 1959, 0),
    Film("Vertigo", year = 1958, 0),
    Film("Star Wars: Episode VI - Return of the Jedi", year = 1983, 0),
    Film("Reservoir Dogs", year = 1992, 0),
    Film("Braveheart", year = 1995, 0),
    Film("M", year = 1931, 0),
    Film("Requiem for a Dream", year = 2000, 0),
    Film("Amélie", year = 2001, 0),
    Film("A Clockwork Orange", year = 1971, 0),
    Film("Like Stars on Earth", year = 2007, 0),
    Film("Taxi Driver", year = 1976, 0),
    Film("Lawrence of Arabia", year = 1962, 0),
    Film("Double Indemnity", year = 1944, 0),
    Film("Eternal Sunshine of the Spotless Mind", year = 2004, 0),
    Film("Amadeus", year = 1984, 0),
    Film("To Kill a Mockingbird", year = 1962, 0),
    Film("Toy Story 3", year = 2010, 0),
    Film("Logan", year = 2017, 0),
    Film("Full Metal Jacket", year = 1987, 0),
    Film("Dangal", year = 2016, 0),
    Film("The Sting", year = 1973, 0),
    Film("2001: A Space Odyssey", year = 1968, 0),
    Film("Singin' in the Rain", year = 1952, 0),
    Film("Toy Story", year = 1995, 0),
    Film("Bicycle Thieves", year = 1948, 0),
    Film("The Kid", year = 1921, 0),
    Film("Inglourious Basterds", year = 2009, 0),
    Film("Snatch", year = 2000, 0),
    Film("3 Idiots", year = 2009, 0),
    Film("Monty Python and the Holy Grail", year = 197, 0)
).mapIndexed { i, film -> film.rank = (i + 1) }

//export const renderFilm: ItemRenderer<IFilm> = (
//film,
//{ handleClick, modifiers, query }
//) => {
//    if (!modifiers.matchesPredicate) {
//        return null;
//    }
//    const text = `${film.rank}. ${film.title}`;
//    return (
//    <MenuItem
//    active={modifiers.active}
//    disabled={modifiers.disabled}
//    label={film.year.toString()}
//    key={film.rank}
//    onClick={handleClick}
//    text={highlightText(text, query)}
//    />
//    );
//};
//
//export const filterFilm: ItemPredicate<IFilm> = (query, film) => {
//    return (
//            `${film.rank}. ${film.title.toLowerCase()} ${film.year}`.indexOf(
//                query.toLowerCase()
//            ) >= 0
//            );
//};
//
//function highlightText(text: string, query: string) {
//    let lastIndex = 0;
//    const words = query
//            .split(/\s+/)
//    .filter(word => word.length > 0)
//    .map(escapeRegExpChars);
//    if (words.length === 0) {
//        return [text];
//    }
//    const regexp = new RegExp(words.join("|"), "gi");
//    const tokens: React.ReactNode[] = [];
//    while (true) {
//        const match = regexp.exec(text);
//        if (!match) {
//            break;
//        }
//        const length = match[0].length;
//        const before = text.slice(lastIndex, regexp.lastIndex - length);
//        if (before.length > 0) {
//            tokens.push(before);
//        }
//        lastIndex = regexp.lastIndex;
//        tokens.push(<strong key={lastIndex}>{match[0]}</strong>);
//    }
//    const rest = text.slice(lastIndex);
//    if (rest.length > 0) {
//        tokens.push(rest);
//    }
//    return tokens;
//}
//
//function escapeRegExpChars(text: string) {
//    return text.replace(/([.*+?^=!:${}()|\[\]\/\\])/g, "\\$1");
//}
//
//export const filmSelectProps = {
//    itemPredicate: filterFilm,
//    itemRenderer: renderFilm,
//    items: TOP_100_FILMS
//};
