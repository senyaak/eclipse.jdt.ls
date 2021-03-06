/*******************************************************************************
* Copyright (c) 2018-2019 Microsoft Corporation and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License 2.0
* which accompanies this distribution, and is available at
* https://www.eclipse.org/legal/epl-2.0/
*
* SPDX-License-Identifier: EPL-2.0
*
* Contributors:
*     Microsoft Corporation - initial API and implementation
*******************************************************************************/

package org.eclipse.jdt.ls.core.internal.text.correction;

import org.eclipse.osgi.util.NLS;

public final class ActionMessages extends NLS {
	private static final String BUNDLE_NAME = ActionMessages.class.getName();

	private ActionMessages() {
		// Do not instantiate
	}

	public static String OverrideMethodsAction_label;
	public static String GenerateGetterSetterAction_label;
	public static String GenerateGetterSetterAction_ellipsisLabel;
	public static String GenerateHashCodeEqualsAction_label;
	public static String GenerateToStringAction_label;
	public static String GenerateConstructorsAction_label;
	public static String GenerateConstructorsAction_ellipsisLabel;
	public static String GenerateDelegateMethodsAction_label;
	public static String MoveRefactoringAction_label;
	public static String InlineMethodRefactoringAction_label;
	public static String InlineConstantRefactoringAction_label;

	static {
		NLS.initializeMessages(BUNDLE_NAME, ActionMessages.class);
	}
}
