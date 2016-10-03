package com.arrow;

/**
        * Catches and responds to JVM failure
        * <p>
* This class represents a catastrophic failure of the system,
* especially the Java virtual machine.  Any class may,
* at any time, indicate that a system failure has occurred by calling
        * {@link #initiateFailure(Error)} (or, less commonly,
        * {@link #setFailure(Error)}).
        * <p>
* In practice, the most common type of failure that is likely to be
        * reported by an otherwise healthy JVM is {@link OutOfMemoryError}.  However,
        * GemFire will report any occurrence of {@link VirtualMachineError} as
        * a JVM failure.
        * <p>
* When a failure is reported, you must assume that the JVM has <em>broken
        * its fundamental execution contract</em> with your application.
        * No programming invariant can be assumed to be true, and your
        * entire application must be regarded as corrupted.
        * <h1>Failure Hooks</h1>
        * GemFire uses this class to disable its distributed system (group
        * communication) and any open caches.  It also provides a hook for you
        * to respond to after GemFire disables itself.
        * <h1>Failure WatchDog</h1>
        * When {@link #startThreads()} is called, a "watchdog" {@link Thread} is started that
        * periodically checks to see if system corruption has been reported.  When
        * system corruption is detected, this thread proceeds to:
        * <p>
* <ol>
* <li>
* <em>Close GemFire</em> -- Group communication is ceased (this cache
        * member recuses itself from the distributed system) and the cache
        * is further poisoned (it is pointless to try to cleanly close it at this
        * point.).
        * <p>
* After this has successfully ended, we launch a
        * </li>
        * <li>
* <em>failure action</em>, a user-defined Runnable
        * {@link #setFailureAction(Runnable)}.
        * By default, this Runnable performs nothing.  If you feel you need to perform
        * an action before exiting the JVM, this hook gives you a
        * means of attempting some action.  Whatever you attempt should be extremely
        * simple, since your Java execution environment has been corrupted.
        * <p>
* GemStone recommends that you employ
        * <a href="http://wrapper.tanukisoftware.org/doc/english/introduction.html">
        * Java Service Wrapper</a> to detect when your JVM exits and to perform
        * appropriate failure and restart actions.
        * </li>
        * <li>
* Finally, if the application has granted the watchdog permission to exit the JVM
        * (via {@link #setExitOK(boolean)}), the watchdog calls {@link System#exit(int)} with
        * an argument of 1.  If you have not granted this class permission to
* close the JVM, you are <em>strongly</em>  advised to call it in your
        * failure action (in the previous step).
        * </li>
        * </ol>
        * <p>
 * Created by ayush.shukla on 9/29/2016.
 */
public class SystemFaliure
{
    static int a;

    static
    {
        a = 5;
    }
}
