import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_org-openqa-selenium-webdriverexception-unknown-error-a-tagname-touppercase-is-not-a-function'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/org-openqa-selenium-webdriverexception-unknown-error-a-tagname-touppercase-is-not-a-function/11602')

'step 2: Add visual checkpoint at Page_t_org-openqa-selenium-webdriverexception-unknown-error-a-tagname-touppercase-is-not-a-function'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00210_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
