/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Matthew Webster - initial implementation
 *******************************************************************************/
package org.aspectj.systemtest.tracing;

import java.io.File;

import junit.framework.Test;

import org.aspectj.testing.XMLBasedAjcTestCase;

public class TracingTests extends org.aspectj.testing.XMLBasedAjcTestCase {

	public static Test suite() {
		return XMLBasedAjcTestCase.loadSuite(TracingTests.class);
	}

	protected File getSpecFile() {
		return new File("../tests/src/org/aspectj/systemtest/tracing/tracing.xml");
	}
	
	public void testTracing () {
  		runTest("Tracing");
	}
	
	public void testDefaultTracing () {
  		runTest("Default tracing");
	}

}