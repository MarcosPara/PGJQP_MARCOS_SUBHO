import { useEffect, useMemo, useRef, useState, type CSSProperties } from 'react';
import { ArrowRight, Check, ChevronDown, Heart, House, Minus, PackageOpen, Plus, Search, ShieldCheck, Shirt, ShoppingBag, Smartphone, Sparkles, Star, Trash2, Truck, X, type LucideIcon } from 'lucide-react';

type Category = 'Electronics' | 'Fashion' | 'Home' | 'Beauty' | 'Everyday';
type ProductKind = 'phone' | 'headphones' | 'jacket' | 'lamp' | 'serum' | 'sneakers' | 'bag' | 'mug';

type Product = {
  id: string;
  name: string;
  category: Category;
  price: number;
  originalPrice?: number;
  rating: string;
  reviews: number;
  label?: string;
  kind: ProductKind;
  color: string;
};

type CartItem = { productId: string; quantity: number };

const PRODUCTS: Product[] = [
  { id: 'aero-phone', name: 'Aero 5G Smartphone · 128 GB', category: 'Electronics', price: 349, originalPrice: 399, rating: '4.8', reviews: 216, label: 'BESTSELLER', kind: 'phone', color: '#d6f0f8' },
  { id: 'studio-headphones', name: 'Studio Wireless Headphones', category: 'Electronics', price: 89, originalPrice: 119, rating: '4.7', reviews: 148, label: 'JUST IN', kind: 'headphones', color: '#e4e9f7' },
  { id: 'weekend-jacket', name: 'Everyday Utility Jacket', category: 'Fashion', price: 74, rating: '4.6', reviews: 82, kind: 'jacket', color: '#f4e6d9' },
  { id: 'arc-lamp', name: 'Arc Table Lamp', category: 'Home', price: 58, originalPrice: 72, rating: '4.9', reviews: 63, label: 'ONESTOP PICK', kind: 'lamp', color: '#f3ead6' },
  { id: 'glow-serum', name: 'Daily Glow Serum · 30 ml', category: 'Beauty', price: 28, rating: '4.8', reviews: 194, kind: 'serum', color: '#f7e1df' },
  { id: 'daybreak-sneakers', name: 'Daybreak Everyday Sneakers', category: 'Fashion', price: 96, originalPrice: 110, rating: '4.7', reviews: 105, kind: 'sneakers', color: '#e0eee5' },
  { id: 'weekender-tote', name: 'Canvas Weekender Tote', category: 'Everyday', price: 42, rating: '4.5', reviews: 71, kind: 'bag', color: '#efe5d8' },
  { id: 'ceramic-mug', name: 'Sunday Ceramic Mug Set', category: 'Home', price: 34, rating: '4.9', reviews: 51, kind: 'mug', color: '#e1eef1' },
];

const CATEGORIES: { name: Category; Icon: LucideIcon; caption: string }[] = [
  { name: 'Electronics', Icon: Smartphone, caption: 'Tech that fits' },
  { name: 'Fashion', Icon: Shirt, caption: 'Wear your way' },
  { name: 'Home', Icon: House, caption: 'Make it yours' },
  { name: 'Beauty', Icon: Sparkles, caption: 'Little rituals' },
  { name: 'Everyday', Icon: ShoppingBag, caption: 'Daily favorites' },
];

const money = (value: number) =>
  new Intl.NumberFormat('en-US', { style: 'currency', currency: 'USD', maximumFractionDigits: 0 }).format(value);

function ProductArt({ kind }: { kind: ProductKind }) {
  if (kind === 'phone') {
    return (
      <svg className="product-object" width="118" height="168" viewBox="0 0 118 168" role="img" aria-label="Illustration of a blue smartphone">
        <defs><linearGradient id="phoneScreen" x1="0" y1="0" x2="1" y2="1"><stop stopColor="#b7eaf7"/><stop offset="1" stopColor="#3a9fc7"/></linearGradient></defs>
        <rect x="21" y="7" width="76" height="154" rx="17" fill="#1e3342"/>
        <rect x="26" y="12" width="66" height="144" rx="13" fill="#f7fcff"/>
        <rect x="30" y="17" width="58" height="134" rx="10" fill="url(#phoneScreen)"/>
        <circle cx="60" cy="68" r="27" fill="#e7fbff" opacity=".34"/>
        <path d="M30 112c17-25 35-30 58-12v41H30z" fill="#1687b2" opacity=".56"/>
        <rect x="52" y="10" width="16" height="3" rx="2" fill="#314c5e"/>
        <circle cx="60" cy="143" r="3" fill="#effbff" opacity=".8"/>
      </svg>
    );
  }
  if (kind === 'headphones') {
    return (
      <svg className="product-object" width="174" height="145" viewBox="0 0 174 145" role="img" aria-label="Illustration of over-ear headphones">
        <path d="M39 82V66c0-30 21-51 48-51s48 21 48 51v16" fill="none" stroke="#34465e" strokeWidth="17" strokeLinecap="round"/>
        <rect x="26" y="67" width="37" height="61" rx="17" fill="#f7f8fc" stroke="#2a3b51" strokeWidth="7"/>
        <rect x="111" y="67" width="37" height="61" rx="17" fill="#f7f8fc" stroke="#2a3b51" strokeWidth="7"/>
        <path d="M37 79v37M137 79v37" stroke="#8da4bc" strokeWidth="3" strokeLinecap="round"/>
      </svg>
    );
  }
  if (kind === 'jacket') {
    return (
      <svg className="product-object" width="156" height="155" viewBox="0 0 156 155" role="img" aria-label="Illustration of a sand-colored jacket">
        <path d="M47 25 62 17h32l15 8 29 22-14 22-15-10v76H47V59L32 69 18 47z" fill="#bc8e68"/>
        <path d="m62 17 16 22 16-22" fill="#e6c5a6"/>
        <path d="M78 39v96M48 77h20M88 77h20" stroke="#87674e" strokeWidth="3"/>
        <path d="m62 17 16 22-10 12-17-26zM94 17 78 39l10 12 17-26z" fill="#d3aa84"/>
        <circle cx="84" cy="59" r="2" fill="#f3e1cd"/><circle cx="84" cy="74" r="2" fill="#f3e1cd"/>
      </svg>
    );
  }
  if (kind === 'lamp') {
    return (
      <svg className="product-object" width="150" height="167" viewBox="0 0 150 167" role="img" aria-label="Illustration of a modern table lamp">
        <path d="M41 59h68L93 17H57z" fill="#e2b95e"/>
        <path d="M72 60h8v65h-8z" fill="#63717a"/>
        <path d="M48 129h56c4 0 7 3 7 7v6H41v-6c0-4 3-7 7-7z" fill="#4c626d"/>
        <path d="m57 24 17 30h15l-17-30z" fill="#f8db91" opacity=".66"/>
      </svg>
    );
  }
  if (kind === 'serum') {
    return (
      <svg className="product-object" width="116" height="165" viewBox="0 0 116 165" role="img" aria-label="Illustration of a skincare serum bottle">
        <rect x="41" y="17" width="34" height="20" rx="4" fill="#9b655d"/>
        <rect x="47" y="7" width="22" height="13" rx="4" fill="#c8988d"/>
        <rect x="27" y="36" width="62" height="111" rx="13" fill="#eebcb1" stroke="#fff5f1" strokeWidth="4"/>
        <rect x="34" y="69" width="48" height="48" rx="5" fill="#fff9f3" opacity=".91"/>
        <path d="M43 83h30M49 92h18M45 103h27" stroke="#b77f73" strokeWidth="2" strokeLinecap="round"/>
        <circle cx="58" cy="57" r="4" fill="#fff8f2" opacity=".75"/>
      </svg>
    );
  }
  if (kind === 'sneakers') {
    return (
      <svg className="product-object" width="184" height="144" viewBox="0 0 184 144" role="img" aria-label="Illustration of a pair of everyday sneakers">
        <path d="M23 88c19-3 33-18 43-46l16 5c5 21 19 31 42 36 17 4 31 13 34 26H24c-10 0-15-16-1-21z" fill="#f9f9f5" stroke="#617a70" strokeWidth="4" strokeLinejoin="round"/>
        <path d="M64 53 85 67M57 65l23 14M50 76l24 13" stroke="#b5c8bb" strokeWidth="4" strokeLinecap="round"/>
        <path d="M26 105h127" stroke="#88aa94" strokeWidth="5" strokeLinecap="round"/>
        <path d="M92 46c-8 23-20 35-35 42" stroke="#779585" strokeWidth="3" fill="none"/>
      </svg>
    );
  }
  if (kind === 'bag') {
    return (
      <svg className="product-object" width="155" height="152" viewBox="0 0 155 152" role="img" aria-label="Illustration of a canvas tote bag">
        <path d="M38 55h79l10 75H28z" fill="#c39a6e"/>
        <path d="M51 58V44c0-16 10-26 27-26s27 10 27 26v14" fill="none" stroke="#8f704f" strokeWidth="8"/>
        <path d="M48 71h59M47 119h61" stroke="#e1c5a1" strokeWidth="3" opacity=".8"/>
        <path d="m77 78 11 17H66z" fill="#f1dec4" opacity=".8"/>
      </svg>
    );
  }
  return (
    <svg className="product-object" width="150" height="150" viewBox="0 0 150 150" role="img" aria-label="Illustration of a ceramic mug">
      <path d="M35 44h74v58c0 18-14 32-32 32h-9c-18 0-33-14-33-32z" fill="#f8fbf8" stroke="#7e9ca4" strokeWidth="4"/>
      <path d="M109 57h8c15 0 19 10 15 23-3 11-11 17-23 17" fill="none" stroke="#7e9ca4" strokeWidth="7"/>
      <path d="M41 59h62" stroke="#c0d7da" strokeWidth="3"/>
      <path d="M62 86c4-8 10-8 14 0m3 0c4-8 10-8 14 0" stroke="#8bb9c2" strokeWidth="3" fill="none" strokeLinecap="round"/>
    </svg>
  );
}

function ProductCard({ product, onAdd, inCart }: { product: Product; onAdd: (product: Product) => void; inCart: boolean }) {
  return (
    <article className="product-card" data-testid={`card-product-${product.id}`}>
      <div className="product-visual" style={{ '--product-bg': product.color } as CSSProperties}>
        {product.label && <span className="product-label">{product.label}</span>}
        <ProductArt kind={product.kind} />
      </div>
      <div className="product-info">
        <div className="product-category">{product.category}</div>
        <h3 className="product-name">{product.name}</h3>
        <div className="product-rating" aria-label={`${product.rating} out of 5 stars, ${product.reviews} reviews`}>
          <Star size={12} fill="currentColor" className="rating-star" aria-hidden="true" />
          <span>{product.rating}</span><span aria-hidden="true">·</span><span>{product.reviews} reviews</span>
        </div>
        <div className="price-line">
          <span className="product-price">{money(product.price)}</span>
          {product.originalPrice && <span className="product-old-price">{money(product.originalPrice)}</span>}
        </div>
        <button
          type="button"
          className={`add-button${inCart ? ' added' : ''}`}
          onClick={() => onAdd(product)}
          aria-label={`${inCart ? 'Add another' : 'Add'} ${product.name} to cart`}
          data-testid={`button-add-${product.id}`}
        >
          {inCart ? <><Check size={14} aria-hidden="true" /> Add another</> : 'Add to bag'}
        </button>
      </div>
    </article>
  );
}

export default function App() {
  const [query, setQuery] = useState('');
  const [category, setCategory] = useState<Category | 'All'>('All');
  const [cart, setCart] = useState<CartItem[]>(() => {
    try {
      const saved = window.localStorage.getItem('onestop-cart');
      return saved ? JSON.parse(saved) as CartItem[] : [];
    } catch {
      return [];
    }
  });
  const [cartOpen, setCartOpen] = useState(false);
  const [toast, setToast] = useState('');
  const [toastKey, setToastKey] = useState(0);
  const cartPanelRef = useRef<HTMLElement | null>(null);

  useEffect(() => {
    window.localStorage.setItem('onestop-cart', JSON.stringify(cart));
  }, [cart]);

  useEffect(() => {
    if (!cartOpen) return;
    const previouslyFocused = document.activeElement instanceof HTMLElement ? document.activeElement : null;
    const panel = cartPanelRef.current;
    const focusables = () => panel?.querySelectorAll<HTMLElement>('button:not([disabled]), [href], input:not([disabled]), [tabindex]:not([tabindex="-1"])');
    focusables()?.[0]?.focus();
    const onKeyDown = (event: KeyboardEvent) => {
      if (event.key === 'Escape') {
        setCartOpen(false);
        return;
      }
      if (event.key === 'Tab' && panel) {
        const items = focusables();
        if (!items?.length) return;
        const first = items[0];
        const last = items[items.length - 1];
        if (event.shiftKey && (document.activeElement === first || !panel.contains(document.activeElement))) {
          event.preventDefault();
          last.focus();
        } else if (!event.shiftKey && (document.activeElement === last || !panel.contains(document.activeElement))) {
          event.preventDefault();
          first.focus();
        }
      }
    };
    window.addEventListener('keydown', onKeyDown);
    return () => {
      window.removeEventListener('keydown', onKeyDown);
      previouslyFocused?.focus();
    };
  }, [cartOpen]);

  useEffect(() => {
    if (!toast) return;
    const timer = window.setTimeout(() => setToast(''), 2400);
    return () => window.clearTimeout(timer);
  }, [toast, toastKey]);

  const visibleProducts = useMemo(() => {
    const term = query.trim().toLowerCase();
    return PRODUCTS.filter((product) => {
      const matchesCategory = category === 'All' || product.category === category;
      const matchesTerm = !term || `${product.name} ${product.category} ${product.kind}`.toLowerCase().includes(term);
      return matchesCategory && matchesTerm;
    });
  }, [category, query]);

  const cartCount = cart.reduce((total, item) => total + item.quantity, 0);
  const cartProducts = cart.map((item) => ({
    ...item,
    product: PRODUCTS.find((product) => product.id === item.productId),
  })).filter((item): item is CartItem & { product: Product } => Boolean(item.product));
  const subtotal = cartProducts.reduce((total, item) => total + item.product.price * item.quantity, 0);

  const addToCart = (product: Product) => {
    setCart((current) => {
      const existing = current.find((item) => item.productId === product.id);
      return existing
        ? current.map((item) => item.productId === product.id ? { ...item, quantity: item.quantity + 1 } : item)
        : [...current, { productId: product.id, quantity: 1 }];
    });
    setToast(`${product.name} added to your bag`);
    setToastKey((value) => value + 1);
  };
  const changeQuantity = (productId: string, change: number) => {
    setCart((current) => current.flatMap((item) => {
      if (item.productId !== productId) return [item];
      const quantity = item.quantity + change;
      return quantity > 0 ? [{ ...item, quantity }] : [];
    }));
  };
  const removeFromCart = (productId: string) => setCart((current) => current.filter((item) => item.productId !== productId));
  const showProducts = (nextCategory?: Category | 'All') => {
    if (nextCategory) setCategory(nextCategory);
    document.getElementById('products')?.scrollIntoView({ behavior: 'smooth', block: 'start' });
  };

  return (
    <div className="app-shell">
      <div className="top-strip">
        <div className="mx-auto flex max-w-[1240px] items-center justify-between px-4 py-[9px] text-[10px] sm:px-7">
          <span className="flex items-center gap-2"><Truck size={13} aria-hidden="true" /> The good stuff, delivered. Free shipping over $75.</span>
          <span className="hidden items-center gap-1.5 sm:flex"><ShieldCheck size={13} aria-hidden="true" /> A little more joy in every order</span>
        </div>
      </div>
      <header className="sticky top-0 z-30 border-b border-[#e4edf1] bg-white/95 backdrop-blur">
        <div className="mx-auto grid max-w-[1240px] grid-cols-[1fr_auto] items-center gap-x-4 gap-y-3 px-4 py-3 sm:grid-cols-[auto_minmax(250px,1fr)_auto] sm:gap-8 sm:px-7 sm:py-4">
          <a href="/" className="brand-mark justify-self-start" aria-label="Onestop homepage">
            <span>one</span><span>stop</span><span aria-hidden="true">.</span>
          </a>
          <label className="header-search order-3 col-span-2 sm:order-none sm:col-span-1">
            <Search size={18} className="shrink-0 text-[#6c8997]" aria-hidden="true" />
            <input
              type="search"
              value={query}
              onChange={(event) => { setQuery(event.target.value); setCategory('All'); }}
              onFocus={() => undefined}
              placeholder="Search the good stuff"
              aria-label="Search products"
              data-testid="input-search-products"
            />
            {query && <button type="button" className="icon-button h-7 w-7 shrink-0" aria-label="Clear search" onClick={() => setQuery('')} data-testid="button-clear-search"><X size={15} /></button>}
          </label>
          <button
            type="button"
            className="header-action justify-self-end"
            onClick={() => setCartOpen(true)}
            aria-label={`Open shopping bag, ${cartCount} items`}
            aria-haspopup="dialog"
            data-testid="button-open-cart"
          >
            <ShoppingBag size={19} aria-hidden="true" /><span className="hidden sm:inline">Your bag</span>
            <span className="cart-count" data-testid="text-cart-count">{cartCount}</span>
          </button>
        </div>
        <nav className="mx-auto flex max-w-[1240px] items-center gap-1 overflow-x-auto px-4 pb-3 sm:px-7" aria-label="Shop categories">
          <button type="button" className={`category-pill${category === 'All' ? ' active' : ''}`} onClick={() => showProducts('All')} data-testid="button-category-all">Everything</button>
          {CATEGORIES.map(({ name }) => (
            <button type="button" key={name} className={`category-pill${category === name ? ' active' : ''}`} onClick={() => showProducts(name)} data-testid={`button-category-${name.toLowerCase()}`}>
              {name}
            </button>
          ))}
        </nav>
      </header>

      <main className="mx-auto max-w-[1240px] px-4 pb-12 pt-5 sm:px-7 sm:pt-7">
        <section className="hero-panel" aria-labelledby="hero-title">
          <div className="hero-copy">
            <div className="hero-kicker">A better kind of browse</div>
            <h1 className="hero-title" id="hero-title">Good finds.<br /><em>All in one place.</em></h1>
            <p className="hero-description">The useful, the lovely, the little things you didn’t know you needed. Meet your new favorite way to shop.</p>
            <button type="button" className="primary-button mt-6" onClick={() => showProducts('All')} data-testid="button-explore-finds">
              Explore the finds <ArrowRight size={16} aria-hidden="true" />
            </button>
          </div>
          <div className="hero-art" aria-hidden="true">
            <div className="hero-orbit" />
            <div className="hero-disc"><div className="hero-phone" /></div>
            <div className="hero-float one">Little wins, daily</div>
            <div className="hero-float two">Picked for real life</div>
          </div>
        </section>

        <section className="mt-9 sm:mt-11" aria-labelledby="categories-heading">
          <div className="section-heading mb-4">
            <div><h2 id="categories-heading">Find your kind of thing</h2><p>Five corners of a very good shop.</p></div>
            <span className="hidden text-[11px] font-semibold text-[#82959e] sm:inline">A little bit of everything</span>
          </div>
          <div className="grid grid-cols-2 gap-3 sm:grid-cols-3 md:grid-cols-5">
            {CATEGORIES.map(({ name, Icon, caption }) => (
              <button key={name} type="button" className="category-card" onClick={() => showProducts(name)} data-testid={`card-category-${name.toLowerCase()}`}>
                <span className="category-icon"><Icon size={23} strokeWidth={1.8} aria-hidden="true" /></span>
                <span>{name}</span>
                <span className="text-[10px] font-normal text-[#8a9da6]">{caption}</span>
              </button>
            ))}
          </div>
        </section>

        <section className="mt-8 sm:mt-10" aria-label="Shopping benefits">
          <div className="promo-band">
            <div>
              <strong>A good shop should make the little things easy.</strong>
              <p>Thoughtful picks across the things you use, wear, and love.</p>
            </div>
            <div className="promo-stamp">Free delivery on $75+</div>
          </div>
        </section>

        <section id="products" className="mt-10 scroll-mt-44 sm:mt-12" aria-labelledby="products-heading">
          <div className="section-heading mb-5">
            <div>
              <h2 id="products-heading">{query ? 'Your search finds' : category === 'All' ? 'A few very good finds' : `In ${category.toLowerCase()}`}</h2>
              <p>{query ? `${visibleProducts.length} ${visibleProducts.length === 1 ? 'result' : 'results'} for “${query}”` : 'A small edit of everyday favorites.'}</p>
            </div>
            <button type="button" onClick={() => { setCategory('All'); setQuery(''); }} className="hidden items-center gap-1 text-[12px] font-semibold text-[#0879a9] hover:text-[#055b7e] sm:flex" data-testid="button-see-everything">
              See everything <ArrowRight size={14} aria-hidden="true" />
            </button>
          </div>
          <div className="grid grid-cols-2 gap-3 sm:grid-cols-2 sm:gap-4 md:grid-cols-3 lg:grid-cols-4">
            {visibleProducts.length ? visibleProducts.map((product) => (
              <ProductCard key={product.id} product={product} onAdd={addToCart} inCart={cart.some((item) => item.productId === product.id)} />
            )) : (
              <div className="empty-results">
                <PackageOpen size={31} className="mx-auto text-[#78aabd]" aria-hidden="true" />
                <h3>Nothing on this shelf just yet</h3>
                <p>Try another search or browse all of our good finds.</p>
                <button type="button" className="primary-button mt-4" onClick={() => { setQuery(''); setCategory('All'); }} data-testid="button-reset-search">Browse everything</button>
              </div>
            )}
          </div>
        </section>
      </main>

      <footer className="footer-note">
        <div className="mx-auto flex max-w-[1240px] flex-col gap-3 px-4 py-6 sm:flex-row sm:items-center sm:justify-between sm:px-7">
          <span className="font-semibold text-[#54707e]">one<span className="text-[#e2a22e]">stop</span>.</span>
          <span>Good finds for everyday life. Made for this demo, not connected to a live store.</span>
          <span className="flex items-center gap-1"><Heart size={12} aria-hidden="true" /> Shop at your own pace.</span>
        </div>
      </footer>

      {cartOpen && (
        <>
          <button className="drawer-backdrop" type="button" aria-label="Close shopping bag" onClick={() => setCartOpen(false)} data-testid="button-close-cart-backdrop" />
          <aside ref={cartPanelRef} className="cart-drawer" role="dialog" aria-modal="true" aria-labelledby="cart-title" data-testid="panel-shopping-cart">
            <div className="cart-header">
              <div><h2 id="cart-title">Your bag <span className="text-[13px] font-medium text-[#83949c]">({cartCount})</span></h2><p className="m-0 mt-1 text-[11px] text-[#85959d]">Your good finds, gathered up.</p></div>
              <button type="button" className="icon-button" aria-label="Close shopping bag" onClick={() => setCartOpen(false)} data-testid="button-close-cart"><X size={19} /></button>
            </div>
            {cartProducts.length ? (
              <>
                <div className="cart-items">
                  {cartProducts.map(({ product, quantity }) => (
                    <div className="cart-row" key={product.id} data-testid={`row-cart-${product.id}`}>
                      <div className="cart-thumb" style={{ '--product-bg': product.color } as CSSProperties}><ProductArt kind={product.kind} /></div>
                      <div>
                        <div className="cart-name">{product.name}</div>
                        <div className="cart-price">{money(product.price)} each</div>
                        <div className="quantity-control" aria-label={`Quantity for ${product.name}`}>
                          <button type="button" aria-label={`Decrease quantity of ${product.name}`} onClick={() => changeQuantity(product.id, -1)} data-testid={`button-decrease-${product.id}`}><Minus size={12} /></button>
                          <span data-testid={`text-quantity-${product.id}`}>{quantity}</span>
                          <button type="button" aria-label={`Increase quantity of ${product.name}`} onClick={() => changeQuantity(product.id, 1)} data-testid={`button-increase-${product.id}`}><Plus size={12} /></button>
                        </div>
                      </div>
                      <div className="flex h-full flex-col items-end justify-between">
                        <strong className="text-[12px] text-[#294657]">{money(product.price * quantity)}</strong>
                        <button type="button" className="remove-button" aria-label={`Remove ${product.name} from bag`} onClick={() => removeFromCart(product.id)} data-testid={`button-remove-${product.id}`}><Trash2 size={15} /></button>
                      </div>
                    </div>
                  ))}
                </div>
                <div className="cart-footer">
                  <div className="cart-total"><span>Subtotal</span><strong data-testid="text-cart-subtotal">{money(subtotal)}</strong></div>
                  <button type="button" className="primary-button w-full cursor-not-allowed opacity-55" disabled aria-label="Checkout is unavailable in this storefront demo" data-testid="button-demo-checkout">
                    Checkout unavailable in demo <ChevronDown size={15} aria-hidden="true" />
                  </button>
                  <p className="demo-note">Storefront demo only. No live checkout, payment, or order will be created.</p>
                </div>
              </>
            ) : (
              <div className="empty-cart">
                <span className="grid h-[72px] w-[72px] place-items-center rounded-full bg-[#e7f5fb] text-[#4d9cba]"><ShoppingBag size={29} strokeWidth={1.5} aria-hidden="true" /></span>
                <h3>Your bag is taking a breather</h3>
                <p>When something catches your eye, it’ll be right here.</p>
                <button type="button" className="primary-button mt-3" onClick={() => setCartOpen(false)} data-testid="button-continue-shopping">Keep browsing <ArrowRight size={15} /></button>
              </div>
            )}
          </aside>
        </>
      )}
      {toast && <div key={toastKey} role="status" aria-live="polite" className="toast-message" data-testid="status-cart-toast">{toast}</div>}
    </div>
  );
}

