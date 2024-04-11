# Squint + Solid + Vite Example Todo App

This is a demo/example todo app using [Squint](https://github.com/squint-cljs/squint), [Solid.js](https://solidjs.com), Vite (https://vitejs.dev), and TailwindCSS (https://tailwindcss.com).

I wanted to build a SPA using ClojureScript, but without bringing in React. Solid.js seems like a _solid_ alternative.., so I'll be experimenting with it more in the future. This repo also acts as a "template" for my future projects using this stack.

Note:
Tailwind live class recompilation isn't working for some reason. I suspect this has something to do with `vite-plugin-squint` creating virtual `.cljs.jsx` files. Will fix soon (hopefully).

## Development

```
# clone the repo
git clone https://github.com/rmrt1n/squint-solid-demo

# go to the project directory
cd squint-solid-demo

# install dependencies
pnpm i

# run the dev server
pnpm dev
```
