# Loko Immeuble

[![Android build](https://github.com/blamlawrence-droid/loko-immeuble/actions/workflows/android-build.yml/badge.svg)](https://github.com/blamlawrence-droid/loko-immeuble/actions)

Application mobile pour chercher, publier, louer et gérer des logements.

Build CI: la pipeline GitHub Actions construira un `app-debug.apk` et le publiera
comme artifact de l'exécution. Pour builder localement, voir `android/README_APP.md`.

Quick local build:

```bash
# (optionnel) générer la gradle wrapper si vous avez gradle installé:
./scripts/generate-gradle-wrapper.sh
cd android
./gradlew assembleDebug
# APK généré: android/app/build/outputs/apk/debug/app-debug.apk
```
