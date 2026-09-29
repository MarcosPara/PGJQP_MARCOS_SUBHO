import figureImage from './assets/house-figure-cutout.png';

const artists = 'Max Lowe · Paolo Rocco · Juliet Fox';

export default function App() {
  return (
    <main className="stage">
      <article className="poster" aria-labelledby="poster-brand">
        <header className="poster__masthead">
          <h1 className="poster__brand" id="poster-brand">
            Deep Orange
          </h1>
          <div className="poster__rule" aria-hidden="true" />
        </header>

        <div className="poster__word" aria-hidden="true">
          <span>H</span>
          <span>O</span>
          <span>U</span>
          <span>S</span>
          <span>E</span>
        </div>

        <div className="poster__figure">
          <img
            src={figureImage}
            alt="Cutout portrait featured on the event poster"
          />
        </div>

        <section className="poster__details" aria-label="Event details">
          <div className="poster__rule" aria-hidden="true" />
          <p className="poster__date">Saturday 24 August 2024</p>
          <div className="poster__rule" aria-hidden="true" />
          <p className="poster__venue">
            The Foundry <span>London</span>
          </p>
          <div className="poster__rule" aria-hidden="true" />
          <p className="poster__artists">{artists}</p>
          <div className="poster__rule" aria-hidden="true" />
          <p className="poster__tickets">
            Doors 11pm <span aria-hidden="true">·</span>{' '}
            Tickets: ResidentAdvisor.net
          </p>
          <div className="poster__rule" aria-hidden="true" />
        </section>
      </article>
    </main>
  );
}