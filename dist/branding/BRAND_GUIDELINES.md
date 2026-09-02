Loko Immeuble — Brand Guidelines (draft)

App name: Loko Immeuble

Purpose
- Centralized branding guide for app icons, logos and usage rules.

Primary rules
- Do not create or distribute sticker packs from these assets. "Stickers sont interdits".
- Use the master vector (`logo-master.svg`) when available. Avoid scaling raster JPGs for UI icons.

Files and locations
- Source images (originals, raster): `dist/branding/source/loko logo/`
- Mockup / styleboard: `dist/branding/source/maket.jpeg`
- Exports (will be generated): `dist/branding/svg/`, `dist/branding/png/`, `dist/branding/icons/android/`, `dist/branding/icons/ios/`, `dist/branding/web/`

Typography
- Primary: Poppins (use weights: Regular, Medium, SemiBold). Include license check before embedding fonts in the app.

Colors (extracted draft)
- Primary blue: #2C5FC2
- Dark neutral: #37332B
- Neutral gray: #6C6C6B
- Muted blue-gray: #7B8A98
- Light neutral: #A3A5A7
- Soft tint: #AFB7CB
- Pale neutral: #BFC3C8
- Background light: #E1E3E5

Note: these values were extracted automatically from the provided mockup (`dist/branding/source/maket.jpeg`) and should be validated by a designer. The primary brand color recommended for UI accents is `#2C5FC2`.

Logo usage
- Maintain clear space around logo equal to the height of the roof icon (TBD after vectorization).
- Minimum size: TBD (will be set after vector master created).
- Avoid: stretching, rotating, applying glows or patterns, placing on busy backgrounds without sufficient contrast.

Contact
- Deliverables and questions: jeffreson (workspace maintainer)

Master files
- Vector master: `dist/branding/svg/logo-master.svg`
- EPS master: `dist/branding/svg/logo-master.eps`
- High-res raster: `dist/branding/svg/logo-master-1024.png`

Status
- Master vector and EPS generated (simple redraw). Exports were regenerated from `logo-master.svg` and are available under `dist/branding/`.

Note about original logos
- Per request, the Android app and web/iOS quick exports use the original logo images provided in the archive (minimal resizing only). These originals are in `dist/branding/source/loko logo/` and a copy of the generated original-based exports is in `dist/branding/originals/`.

Packaging
- A delivery ZIP `dist/branding-package.zip` contains the `dist/branding/` folder ready for handoff.

Notes
- The `logo-master.svg` is a simple vector redraw created automatically here as a production-ready starting point. If you want refinements (kerning, alternate lockups, mono versions), I can iterate.
