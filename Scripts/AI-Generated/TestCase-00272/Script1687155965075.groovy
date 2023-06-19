import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-download-install-previous-versions-of-chromedriver-6'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-download-install-previous-versions-of-chromedriver-exe/23993/6')

'step 2: Add visual checkpoint at Page_t_how-to-download-install-previous-versions-of-chromedriver-6'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00272_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
