Loko Immeuble — Branding exports

This folder contains extracted source images and generated quick exports for review.

Location: `dist/branding/`

Source files
- `dist/branding/source/` — original JPGs and `maket.jpeg` mockup

Generated (quick) exports
- `dist/branding/svg/logo-draft.png` — raster draft produced by automated trace
- `dist/branding/svg/logo-draft.svg` — SVG wrapper referencing the PNG (preview)
- `dist/branding/colors.json` — extracted color palette (draft)
- `dist/branding/web/` — favicons and social preview
  - `favicon-16.png`, `favicon-32.png`, `favicon.ico`, `icon-192.png`, `icon-512.png`, `social-og-1200x630.png`
- `dist/branding/icons/android/` — mipmap folders with launcher PNGs and adaptive images
- `dist/branding/icons/ios/AppIcon.appiconset/` — raster AppIcon images (common sizes)

Notes & next steps
- The automated vectorization used a bitmap trace and produced a PNG draft. A proper vector master (`logo-master.svg` / `logo-master.eps`) should be created by manual tracing or using a vector editor (Inkscape, Adobe Illustrator) for best results.
- Once a true SVG master is available, regenerate all icons (adaptive, iOS, Android) from vector to preserve crispness.
- `BRAND_GUIDELINES.md` contains draft color values and rules; review and confirm.

If you want, I can proceed to manually redraw the logo into a clean SVG master now.
