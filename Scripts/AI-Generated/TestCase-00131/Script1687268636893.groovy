import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-set-the-chrome-options-value-setexperimentaloption-useautomationextension-false'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-set-the-chrome-options-value-setexperimentaloption-useautomationextension-false/11412')

'step 2: Add visual checkpoint at Page_t_how-to-set-the-chrome-options-value-setexperimentaloption-useautomationextension-false'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00131_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
