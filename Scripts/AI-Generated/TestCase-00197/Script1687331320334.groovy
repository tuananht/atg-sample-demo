import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_free-edition-support-docker-image-and-gitlab-ci'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/free-edition-support-docker-image-and-gitlab-ci/59798')

'step 2: Add visual checkpoint at Page_t_free-edition-support-docker-image-and-gitlab-ci'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00197_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
