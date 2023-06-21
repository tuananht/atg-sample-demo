import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_object-iframe-is-not-present-on-headless-chrome-please-help'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/object-iframe-is-not-present-on-headless-chrome-please-help/36209')

'step 2: Add visual checkpoint at Page_t_object-iframe-is-not-present-on-headless-chrome-please-help'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00049_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
