import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_unable-tofix-error-message-incorrect-package-and-activity-retrying-splash-activity-never-star'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/unable-tofix-error-message-incorrect-package-and-activity-retrying-splash-activity-never-star/14144')

'step 2: Add visual checkpoint at Page_t_unable-tofix-error-message-incorrect-package-and-activity-retrying-splash-activity-never-star'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00086_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
