import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_true-false-attributes-always-returned-with-value-of-true-when-using-getattributes-or-verifyelementattributevalue-methods'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/true-false-attributes-always-returned-with-value-of-true-when-using-getattributes-or-verifyelementattributevalue-methods/40851')

'step 2: Add visual checkpoint at Page_t_true-false-attributes-always-returned-with-value-of-true-when-using-getattributes-or-verifyelementattributevalue-methods'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00782_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
