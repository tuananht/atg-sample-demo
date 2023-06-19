import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_is-it-possible-to-set-the-browser-type-directly-in-the-katalon-studio-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/is-it-possible-to-set-the-browser-type-directly-in-the-katalon-studio-script/50166/3')

'step 2: Add visual checkpoint at Page_t_is-it-possible-to-set-the-browser-type-directly-in-the-katalon-studio-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00095_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
