# Phase 1

Checking first == second shows that both variables point to the same
object. Changing a setting through one reference also changes what
the other reference reads.

The private constructor prevents other classes from making their own
ConfigurationManager. The static getInstance() method gives them
access to the single shared instance.

# Phase 2

Eager initialization creates the instance when the class loads.
Lazy initialization waits until getInstance() is first called.

Lazy loading is useful when creating the object takes extra time or
resources, especially if it might never be used. The downside is that
the first call takes longer. Multiple threads also need to be handled
carefully so they do not create separate instances.

# Phase 3

The subsystem constructors do not show that they need the
ConfigurationManager. That dependency is hidden inside their methods.

This makes testing harder because I cannot easily give each subsystem
separate test settings. Since they share one object, a setting changed
by one test could affect another test.

# Phase 4

The console uses a loop so the user can keep changing settings until
they choose to exit. AudioSystem and GraphicsRenderer read from the
same ConfigurationManager, so they use the updated settings.

The menu handles invalid choices, and the volume input checks for
whole numbers between 0 and 100.
